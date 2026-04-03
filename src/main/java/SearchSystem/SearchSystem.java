package SearchSystem;

import java.util.ArrayList;

public class SearchSystem {
    private String searchQuery;
    private String searchType;
    private ArrayList<String> results;

    public SearchSystem() {
        this.searchQuery = "";
        this.searchType = "";
        this.results = new ArrayList<String>();
    }

    public void start() {
        System.out.println("Welcome to SearchSystem");
    }
}