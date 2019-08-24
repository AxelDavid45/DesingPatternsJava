package PatronesEstructurales.Adapter;

public class Adapter implements DbSQL {
    DbNoSQL mongoDb;

    public Adapter (DbNoSQL mongo) {
        this.mongoDb = mongo;
    }

    @Override
    public void conectar() {
        this.mongoDb.conectar();
    }

    @Override
    public void run() {
        this.mongoDb.executeSentence();
    }
}
