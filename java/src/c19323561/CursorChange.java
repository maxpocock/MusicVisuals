package C19323561;

import java.awt.Cursor;

public class CursorChange extends javax.swing.JFrame{

    Cursor cursorDefault = new Cursor(Cursor.DEFAULT_CURSOR);
    Cursor cursorHand = new Cursor(Cursor.HAND_CURSOR);

    public CursorChange (Dial dial)
    {

    }

    public void cursorHand()
    {
        setCursor(cursorHand);
    }

    public void cursorDefault()
    {
        setCursor(cursorDefault);
    }

}
