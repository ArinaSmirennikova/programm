public class Printer {
    private String queue = "";
    private int pagesCount = 0;
    private static int donePagesCount = 0;
    private static int allDonePagesCount = 0;

    public void append(String text, String name, int pagesCount) {
        if (pagesCount != 1){
            this.pagesCount = this.pagesCount + pagesCount;
        } else {
            this.pagesCount++;
        }
        if (name != ""){
            queue = queue + "\n" + name + " - " + text;
        } else {
            queue = queue + "\n" + "Документ без имени" + " - " + text;
        }
        donePagesCount = donePagesCount + pagesCount;
    }
    public void append(String text, int pagesCount) {
        append(text, "",pagesCount);
    }
    public void append(String text, String name) {
        append(text, name,1);
    }
    public void append(String text) {
        append(text,"",1);
    }

    public void clear() {
        queue = "";
        pagesCount = 0;
        donePagesCount = 0;
    }
    public void print() {
        System.out.println("\n" + "Документы в очереди:" + queue);
        allDonePagesCount = allDonePagesCount + donePagesCount;
        clear();
    }

    public int getPendingPagesCount(){
        return donePagesCount;
    }
    public int getAllPrinteredPagesCount(){return allDonePagesCount;}
}
