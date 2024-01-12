public class AuntSue {
    private int number;
    private int children;
    private int cats;
    private int samoyeds;
    private int pomeranians;
    private int akitas;
    private int vizslas;
    private int goldfish;
    private int trees;
    private int cars;
    private int perfumes;
    private boolean isRealSue;

    public AuntSue(int number) {
        this.number = number;
        children = -1;
        cats = -1;
        samoyeds = -1;
        pomeranians = -1;
        akitas = -1;
        vizslas = -1;
        goldfish = -1;
        trees = -1;
        cars = -1;
        perfumes = -1;
        isRealSue = true;
    }

    public String toString() {
        String output = "";
        output = "Sue number: " + number + "\n";
        output += "children: " + children + "\n";
        output += "cats: " + cats + "\n";
        output += "samoyeds: " + samoyeds + "\n";
        output += "pomeranians: " + pomeranians + "\n";
        output += "akitas: " + akitas + "\n";
        output += "vizslas: " + vizslas + "\n";
        output += "goldfish: " + goldfish + "\n";
        output += "trees: " + trees + "\n";
        output += "cars: " + cars + "\n";
        output += "perfumes: " + perfumes + "\n";

        return output;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public int getChildren() {
        return children;
    }

    public void setChildren(int children) {
        this.children = children;
    }

    public int getCats() {
        return cats;
    }

    public void setCats(int cats) {
        this.cats = cats;
    }

    public int getSamoyeds() {
        return samoyeds;
    }

    public void setSamoyeds(int samoyeds) {
        this.samoyeds = samoyeds;
    }

    public int getPomeranians() {
        return pomeranians;
    }

    public void setPomeranians(int pomeranians) {
        this.pomeranians = pomeranians;
    }

    public int getAkitas() {
        return akitas;
    }

    public void setAkitas(int akitas) {
        this.akitas = akitas;
    }

    public int getVizslas() {
        return vizslas;
    }

    public void setVizslas(int vizslas) {
        this.vizslas = vizslas;
    }

    public int getGoldfish() {
        return goldfish;
    }

    public void setGoldfish(int goldfish) {
        this.goldfish = goldfish;
    }

    public int getTrees() {
        return trees;
    }

    public void setTrees(int trees) {
        this.trees = trees;
    }

    public int getCars() {
        return cars;
    }

    public void setCars(int cars) {
        this.cars = cars;
    }

    public int getPerfumes() {
        return perfumes;
    }

    public void setPerfumes(int perfumes) {
        this.perfumes = perfumes;
    }

    public boolean isRealSue() {
        return isRealSue;
    }

    public void setRealSue(boolean realSue) {
        isRealSue = realSue;
    }

    public void updateSue(String data) {
        // STEP 1: Implement this method
        // Format of data String:
        // Sue 1: cars: 9, akitas: 3, goldfish: 0
        // (could be any possible attribute)
        // Update each attribute of this sue appropriately
        // You will need to use the split method here!
    }
}
