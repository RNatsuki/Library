package Model;

/**
 *
 * @author Ibarra
 */
public class Book {

    int BOOK_ID;
    String TITLE;
    int PUBLISHED_YEAR;
    String AUTHOR;
    String CATEGORY;
    int EDITION;
    String LANGUAJE;
    int STOCK;
    boolean isDigital;
    
    public Book(int BOOK_ID, String TITLE, int PUBLISHED_YEAR, String AUTHOR, String CATEGORY, int EDITION, String LANGUAJE) {
        this.BOOK_ID = BOOK_ID;
        this.TITLE = TITLE;
        this.PUBLISHED_YEAR = PUBLISHED_YEAR;
        this.AUTHOR = AUTHOR;
        this.CATEGORY = CATEGORY;
        this.EDITION = EDITION;
        this.LANGUAJE = LANGUAJE;
        
    }
    
    public Book(int BOOK_ID, String TITLE, int PUBLISHED_YEAR, String AUTHOR, String CATEGORY, int EDITION, String LANGUAJE, int STOCK) {
        this.BOOK_ID = BOOK_ID;
        this.TITLE = TITLE;
        this.PUBLISHED_YEAR = PUBLISHED_YEAR;
        this.AUTHOR = AUTHOR;
        this.CATEGORY = CATEGORY;
        this.EDITION = EDITION;
        this.LANGUAJE = LANGUAJE;
        this.STOCK = STOCK;
        
    }
    public int getBOOK_ID() {
        return BOOK_ID;
    }

    public void setBOOK_ID(int BOOK_ID) {
        this.BOOK_ID = BOOK_ID;
    }

    public String getTITLE() {
        return TITLE;
    }

    public void setTITLE(String TITLE) {
        this.TITLE = TITLE;
    }

    public int getPUBLISHED_YEAR() {
        return PUBLISHED_YEAR;
    }

    public void setPUBLISHED_YEAR(int PUBLISHED_YEAR) {
        this.PUBLISHED_YEAR = PUBLISHED_YEAR;
    }

    public String getAUTHOR() {
        return AUTHOR;
    }

    public void setAUTHOR(String AUTHOR) {
        this.AUTHOR = AUTHOR;
    }

    public String getCATEGORY() {
        return CATEGORY;
    }

    public void setCATEGORY(String CATEGORY) {
        this.CATEGORY = CATEGORY;
    }

    public int getEDITION() {
        return EDITION;
    }

    public void setEDITION(int EDITION) {
        this.EDITION = EDITION;
    }

    public String getLANGUAJE() {
        return LANGUAJE;
    }

    public void setLANGUAJE(String LANGUAJE) {
        this.LANGUAJE = LANGUAJE;
    }

    public int getSTOCK() {
        return STOCK;
    }

    public void setSTOCK(int STOCK) {
        this.STOCK = STOCK;
    }

   
}
