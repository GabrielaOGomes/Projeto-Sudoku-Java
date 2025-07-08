package ui.custom.button.input;

import javax.swing.text.AttributeSet;
import javax.swing.text.BadLocationException;
import javax.swing.text.PlainDocument;
import java.net.http.WebSocket;
import java.util.List;

import static java.util.Objects.isNull;

public class NumberTextLimit extends PlainDocument {

    private final List<String> NUMBERS = List.of("1", "2", "3", "4", "5", "6", "7", "8", "9");

    public void insertString(int offset, String str, AttributeSet attr) throws BadLocationException {
        if(isNull(str) || (!NUMBERS.contains(str))) return;

        if(getLength() + str.length() <= 1 ){
            super.insertString(offset, str, attr);
        }
    }


}
