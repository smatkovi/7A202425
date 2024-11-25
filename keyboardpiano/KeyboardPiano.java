import javax.sound.midi.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class KeyboardPiano extends JFrame implements KeyListener {

    private Synthesizer synthesizer;
    private MidiChannel channel;

    public KeyboardPiano() {
        setTitle("Klavier");
        setSize(800, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new GridLayout(1, 12));

        // Klaviertasten erstellen
        String[] keys = {"C", "D", "E", "F", "G", "A", "B", "C2", "D2", "E2", "F2", "G2"};
        for (String key : keys) {
            JButton button = new JButton(key);
            button.setEnabled(false); // Nur als Anzeige
            add(button);
        }

        // MIDI initialisieren
        try {
            synthesizer = MidiSystem.getSynthesizer();
            synthesizer.open();
            channel = synthesizer.getChannels()[0];
        } catch (Exception e) {
            e.printStackTrace();
        }

        addKeyListener(this);
        setFocusable(true);
        setVisible(true);
    }

    @Override
    public void keyTyped(KeyEvent e) {
    }

    @Override
    public void keyPressed(KeyEvent e) {
        int keyCode = e.getKeyCode();
        int note = getNoteFromKeyCode(keyCode);
        if (note != -1) {
            channel.noteOn(note, 100);
        }
    }

    @Override
    public void keyReleased(KeyEvent e) {
        int keyCode = e.getKeyCode();
        int note = getNoteFromKeyCode(keyCode);
        if (note != -1) {
            channel.noteOff(note);
        }
    }

    private int getNoteFromKeyCode(int keyCode) {
        // Tastenbelegung auf MIDI-Noten mappen
        if (keyCode == KeyEvent.VK_A) return 60; // C
        if (keyCode == KeyEvent.VK_W) return 61; // Cis
        if (keyCode == KeyEvent.VK_S) return 62; // D
        if (keyCode == KeyEvent.VK_D) return 64; // E
        if (keyCode == KeyEvent.VK_F) return 65; // F
        if (keyCode == KeyEvent.VK_G) return 67; // G
        if (keyCode == KeyEvent.VK_H) return 69; // A
        if (keyCode == KeyEvent.VK_J) return 71; // B
        if (keyCode == KeyEvent.VK_K) return 72; // C2
        if (keyCode == KeyEvent.VK_L) return 74; // D2
        if (keyCode == KeyEvent.VK_SEMICOLON) return 76; // E2
        if (keyCode == KeyEvent.VK_QUOTE) return 77; // F2
        return -1; // Keine gültige Note
    }

    public static void main(String[] args) {
        new KeyboardPiano();
    }
}
