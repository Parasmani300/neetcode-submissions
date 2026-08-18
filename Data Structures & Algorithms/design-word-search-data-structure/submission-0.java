class WordDictionary {
    static class TrieNode{
        TrieNode[] children;
        boolean isEnd;

        public TrieNode(){
            this.children = new TrieNode[26];
            this.isEnd = false;
        }
    }

    private TrieNode root;

    public WordDictionary() {
        this.root = new TrieNode();
    }

    public void addWord(String word) {
        TrieNode current = root;

        for(char ch : word.toCharArray()){
            int index = ch - 'a';
            
            if(current.children[index] == null){
                current.children[index] = new TrieNode();
            }
            current = current.children[index];
        }
        current.isEnd = true;
    }

    public boolean search(String word) {
        return searchit(root,word,0);
    }

    public boolean searchit(TrieNode root,String word,int index) {
        if(index == word.length())
            return root.isEnd;
        
        char ch = word.charAt(index);

        if(ch != '.'){
            int childIndex = ch - 'a';

            if(root.children[childIndex] == null)
                return false;

            return searchit(root.children[childIndex],word,index+1);
        }

        for(int i = 0;i<26;i++){
            if(root.children[i] != null){
                if(searchit(root.children[i],word,index+1)){
                    return true;
                }
            }
        }

        return false;

    }
}
