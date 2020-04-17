public class MyException extends Exception {
    static final long serialVersionUID=13145524324L;
    private int idnumber;
    public MyException() {}
    public MyException(String message, int idnumber) {
        super(message);
        this.idnumber = idnumber;
    }
    public int getIdnumber() { return idnumber; }
}
