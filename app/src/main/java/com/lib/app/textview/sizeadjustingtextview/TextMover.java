package com.lib.app.textview.sizeadjustingtextview;



/**
 * Created by chenger on 5/26/14.
 */
public class TextMover {
    public static void moveTextFromCellToCell(SizeAdjustingTextView startingCell,
                                              SizeAdjustingTextView endCell){
        if(!startingCell.getText().toString().isEmpty()){
            String text = startingCell.getText().toString();
            endCell.setText(text);
        }
    }

    public static void moveNewTextIntoCell(SizeAdjustingTextView targetCell,
                                           String text){
        targetCell.setText(text);
    }
}
