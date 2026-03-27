package creational.builder.B3;

public class Main {
    public static void main(String[] args) {
        Folder dataFolder = new Folder("Data (D:)", "12/03/2026");
        Folder tailieuFolder = new Folder("TaiLieu", "12/03/2026");
        Folder dpFolder = new Folder("Design Pattern", "12/03/2026");
        Folder ltjvFolder = new Folder("Lap Trinh Java", "12/03/2026");
        Folder lttbddFolder = new Folder("LapTrinhThietBiDiDong", "12/03/2026");

        FileItem nnltCFile = new FileItem("NgonNguLapTrinhC.pdf", "12/03/2026");
        FileItem cpFile = new FileItem("CreationalPattern.pptx", "12/03/2026");
        FileItem spFile = new FileItem("StructuralPattern.pptx", "12/03/2026");
        FileItem ltjcbFile = new FileItem("LapTrinhJavaCoBan.docx", "12/03/2026");
        FileItem ltjncFile = new FileItem("LapTrinhJavaNangCao.docx", "12/03/2026");
        FileItem tbddcbFile = new FileItem("CoBan.pptx", "12/03/2026");
        FileItem tbddncFile = new FileItem("NangCao.pptx", "12/03/2026");

        dpFolder.addItem(cpFile);
        dpFolder.addItem(spFile);

        ltjvFolder.addItem(ltjcbFile);
        ltjvFolder.addItem(ltjncFile);

        lttbddFolder.addItem(tbddcbFile);
        lttbddFolder.addItem(tbddncFile);

        tailieuFolder.addItem(dpFolder);
        tailieuFolder.addItem(ltjvFolder);
        tailieuFolder.addItem(nnltCFile);
        tailieuFolder.addItem(lttbddFolder);

        dataFolder.addItem(tailieuFolder);


        System.out.println("So do cay \n" + dataFolder.getStringTreeFolder(""));
        System.out.println("Duong dan: " + nnltCFile.getPath());
    }
}
