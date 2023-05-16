package PriorityQueue;

public class ComparableBook implements Comparable<ComparableBook>{
    int code;
    String bookName;

    public ComparableBook(int code, String bookName) {
        this.code = code;
        this.bookName = bookName;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    @Override
    public int compareTo(ComparableBook otherBook) {
        if (this.code > otherBook.code)
            return -1;
        else if (this.code < otherBook.code)
            return 1;
        else
            return 0;
    }

    @Override
    public String toString() {
        return "Book [code=" + code + ", bookName=" + bookName + "]";
    }
}
