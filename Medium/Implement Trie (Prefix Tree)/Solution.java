class Trie {

    Map<Integer, String> map;
    Set<String> set;
    int size;

    public Trie() {
        map = new HashMap<>();
        set = new HashSet<>();
        size = 0;
    }

    public void insert(String word) {
        map.put(size++, word);
        set.add(word);
    }

    public boolean search(String word) {
        return set.contains(word);
    }

    public boolean startsWith(String prefix) {
        for(int i=0; i<size; i++){
            if(map.get(i).startsWith(prefix)){
                return true;
            }
        }

        return false;
    }
}

/**
 * Your Trie object will be instantiated and called as such:
 * Trie obj = new Trie();
 * obj.insert(word);
 * boolean param_2 = obj.search(word);
 * boolean param_3 = obj.startsWith(prefix);
 */