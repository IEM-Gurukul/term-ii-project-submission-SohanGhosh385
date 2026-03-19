public class IssueRecord {

    private int studentId;
    private int bookId;

    public IssueRecord(int studentId, int bookId) {
        this.studentId = studentId;
        this.bookId = bookId;
    }

    public int getStudentId() {
        return studentId;
    }

    public int getBookId() {
        return bookId;
    }
}