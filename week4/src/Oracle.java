public class Oracle implements Database{
    @Override
    public void select(){
        System.out.println("select");
    }
    @Override
    public void insert() {
        System.out.println("insert");

    }
    @Override
    public void update() {
        System.out.println("update");

    }
    @Override
    public void delete() {
        System.out.println("delete");

    }
}
