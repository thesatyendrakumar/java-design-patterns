package org.thesatyendrakumar.structural_patterns.flyweight;

import java.util.HashMap;
import java.util.Map;

public class BranchFactory {
    private static Map<String, Branch> branchMap = new HashMap<>();

    public static Branch getBranch(String branchName, String branchAddress) {
        String key = branchName + branchAddress;
        if (!branchMap.containsKey(key)) {
            branchMap.put(key, new Branch(branchName, branchAddress));
        }
        return branchMap.get(key);
    }
}
