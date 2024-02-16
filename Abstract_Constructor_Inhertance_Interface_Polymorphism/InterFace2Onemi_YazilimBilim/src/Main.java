class DatabaseManager{
    public void AddDatabase(IDatabase database){
        database.add();
    }
    public void UpdateDatabase(IDatabase database){
        database.update();
    }
    public void GetDataBase(IDatabase database){
        database.get();
    }
    public void DeleteDataBase(IDatabase database){
        database.delete();
    }

}
public class Main {
    public static void main(String[] args) {
        DatabaseManager manager = new DatabaseManager();
        manager.AddDatabase(new MongoDatabase());
        manager.AddDatabase(new MysqlDatabase());


    }
}