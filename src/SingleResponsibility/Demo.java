package SingleResponsibility;

public class Demo {
    public static void main(String[] args) {
        ReportGenerator reportGenerator = new ReportGenerator("Some report content");
        ReportSaver reportSaver = new ReportSaver();
        reportGenerator.generateReport();
        reportSaver.saveToFile(reportGenerator);

    }
}

class ReportGenerator {
    private String content;

    public ReportGenerator(String content) {
        this.content = content;
    }

    public void generateReport() {
        // Logic for generating a report
        System.out.println("Generating a report...");
    }
}

// Class with a single responsibility - Saving a report to a file
class ReportSaver {
    public void saveToFile(ReportGenerator reportGenerator) {
        // Logic for saving the report to a file
        System.out.println("Saving the report to a file...");
    }
}