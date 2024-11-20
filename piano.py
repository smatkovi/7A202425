import pygame
import pygame.midi

# Initialisierung
pygame.init()
pygame.midi.init()

# Fenster erstellen
screen = pygame.display.set_mode((800, 200))
pygame.display.set_caption("Python Klavier")
font = pygame.font.SysFont("Arial", 24)

# MIDI-Synthesizer initialisieren
midi_out = pygame.midi.Output(pygame.midi.get_default_output_id())

# Tasten zu MIDI-Noten zuordnen
def get_note_from_key(key):
    if key == pygame.K_a: return 60  # C
    if key == pygame.K_s: return 62  # D
    if key == pygame.K_d: return 64  # E
    if key == pygame.K_f: return 65  # F
    if key == pygame.K_g: return 67  # G
    if key == pygame.K_h: return 69  # A
    if key == pygame.K_j: return 71  # B
    if key == pygame.K_k: return 72  # C2
    if key == pygame.K_l: return 74  # D2
    if key == pygame.K_SEMICOLON: return 76  # E2
    if key == pygame.K_QUOTE: return 77  # F2
    return None

# Hauptschleife
running = True
pressed_keys = set()  # Set zum Verwalten gedrückter Tasten
while running:
    screen.fill((255, 255, 255))

    # Tastenanzeige
    keys = ["C (A)", "D (S)", "E (D)", "F (F)", "G (G)", "A (H)", "B (J)", "C2 (K)", "D2 (L)", "E2 (;)", "F2 (')"]
    for i, key in enumerate(keys):
        color = (200, 200, 200) if i % 2 == 0 else (150, 150, 150)
        pygame.draw.rect(screen, color, (i * 70, 50, 70, 100))
        text = font.render(key, True, (0, 0, 0))
        screen.blit(text, (i * 70 + 5, 90))

    for event in pygame.event.get():
        if event.type == pygame.QUIT:
            running = False
        elif event.type == pygame.KEYDOWN:
            note = get_note_from_key(event.key)
            if note and note not in pressed_keys:
                pressed_keys.add(note)
                midi_out.note_on(note, velocity=100)
        elif event.type == pygame.KEYUP:
            note = get_note_from_key(event.key)
            if note and note in pressed_keys:
                pressed_keys.remove(note)
                midi_out.note_off(note, velocity=100)

    pygame.display.flip()

# Aufräumen
midi_out.close()
pygame.midi.quit()
pygame.quit()

