package creational.builder.B3;

public class FileItem extends AbstractFile{
    public FileItem(String name, String ngayTao) {
        super(name, ngayTao);
    }

    @Override
    public String getStringTreeFolder(String prefix) {
        return prefix + name + "\n";
    }

    @Override
    public String getPath() {
        if(parent != null) {
            return parent.getPath() + "\\" + name;
        }
        return name;
    }
}
