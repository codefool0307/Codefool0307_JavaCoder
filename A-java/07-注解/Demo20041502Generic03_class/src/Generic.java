public class Generic<T> {
    private T name;
    public Generic(T name){
       this.name=name;
    }
    public Generic() { }
    public T getName() {
        return name;
    }
    public void setName(T name) {
        this.name = name;
    }
    @Override
    public String toString() {
        return "Generic{" +
                "name=" + name +
                '}';
    }
}
