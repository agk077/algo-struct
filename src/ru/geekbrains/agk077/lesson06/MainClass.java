package ru.geekbrains.agk077.lesson06;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class MainClass {
    public static void main(String[] args) {
        Random rnd = new Random();
        int countOfTrees = 20;
        int maxTreeLevel = 4;
        int nodeCount = (int) (Math.pow(2, maxTreeLevel) - 1);

        int maxNodeValue = 25;
        int countOfBalancedTrees = 0;
        boolean treeView = false;
        List<Tree> listOfTrees = new ArrayList<>();


        for (int i = 0; i <countOfTrees; i++) {
            Tree<Integer> theTree = new TreeImpl<>(maxTreeLevel);
            initTree(rnd, nodeCount, maxNodeValue, theTree);
            listOfTrees.add(theTree);
        }


        System.out.println("Lets show all balanced trees: ");

        for (Tree tree: listOfTrees) {
            if (tree.isBalanced()) {
                tree.display();
                countOfBalancedTrees++;
            }
        }

        System.out.println("Count of balanced trees = " + ((countOfBalancedTrees / (countOfTrees * 1.0)) * 100) + "%");
    }

    private static void initTree(Random rand, int nodeCount, int maxValue, Tree<Integer> theTree) {
        for (int j = 0; j < nodeCount; j++) {
            theTree.add(rand.nextInt(maxValue * 2 + 1) - maxValue);// [-25; 25]
        }
    }
}
