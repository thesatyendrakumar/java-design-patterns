package org.thesatyendrakumar.structural_patterns.flyweight;

public class Branch {
    private String branchName;
    private String branchAddress;

    public Branch(String branchName, String branchAddress) {
        this.branchName = branchName;
        this.branchAddress = branchAddress;
    }

    // Getters
    public String getBranchName() {
        return branchName;
    }

    public String getBranchAddress() {
        return branchAddress;
    }
}
