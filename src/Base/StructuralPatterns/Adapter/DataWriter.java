package Base.StructuralPatterns.Adapter;

public class DataWriter implements Writer {
    @Override
    public void save(String data) {
        NewWriter adapter = new NewWriter();
        adapter.save(data, 2);
    }
}
