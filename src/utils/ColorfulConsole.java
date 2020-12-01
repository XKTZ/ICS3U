package utils;

public class ColorfulConsole {
    // the time add once or minus once
    private long timeOnce;
    // the message
    private String msg;
    // the colors
    private int[] colors = new int[]{31, 32, 33, 34, 35};
    private int colorIndex = 0;
    private int stringIndex = 0;
    private boolean stringIndexIncreasing = true;

    public ColorfulConsole(String msg, long timeTotal) {
        this.msg = msg;
        timeOnce = timeTotal / msg.length();
    }

    /**
     * Console until the exit
     */
    public void console() {
        while (true) {
            println();
            try {
                Thread.sleep(timeOnce);
            } catch (InterruptedException ie) {
                ie.printStackTrace();
                System.exit(1);
            }
        }
    }

    /**
     * Print a line of message and refresh
     */
    private void println() {
        System.out.print("\r\33["+colors[colorIndex]+"m"+msg.substring(0, stringIndex+1)
         + getNumSpaces(msg.length() - stringIndex));
        refresh();
    }

    /**
     * refresh
     */
    private void refresh() {
        refreshStringIndex();
        refreshColorIndex();
    }

    /**
     * Refresh the string index
     */
    private void refreshStringIndex() {
        // if string number is increasing, add the string index, if the string number is decreasing, decrease the string index
        if (stringIndexIncreasing) {
            stringIndex ++;
        } else {
            stringIndex --;
        }
        // if string index is 0, set the string is increasing to true because it is already at the head of string
        if (stringIndex == 0) {
            stringIndexIncreasing = true;
        }
        // if the string index is already more than the available, change it to decreasing 
        else if (stringIndex == msg.length()) {
            stringIndexIncreasing = false ;
            stringIndex --;
        }
    }

    /**
     * refresh the color index
     */
    private void refreshColorIndex() {
        // increase the color index
        colorIndex ++;
        // if the color index is already more than the avaibable, change it back to 0
        if (colorIndex == colors.length) {
            colorIndex = 0;
        }
    }

    /**
     * get a string of spaces with specific length
     * @param n the number of spaces
     * @return the string
     */
    private static String getNumSpaces(int n) {
        StringBuilder builder = new StringBuilder();
        for (int i = 0; i < n; i++) {
            builder.append(" ");
        }
        return builder.toString();
    }
}
