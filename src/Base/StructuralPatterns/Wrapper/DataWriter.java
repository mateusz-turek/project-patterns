package Base.StructuralPatterns.Wrapper;

public class DataWriter implements Writer {
    @Override
    public void save(String data) {
        NewWriter adapter = new NewWriter();
        adapter.save(data, 2);
    }
}
