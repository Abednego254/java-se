package gratis.selftestengine;

interface Exportable {
    void export();
}
class Tool implements Exportable {
    public void export() {
    System.out.println("Tool::Export");
    }
}
class ReportTool extends Tool implements Exportable {
    public void export() {
        System.out.println("ReportTool::Export");
    }
}
