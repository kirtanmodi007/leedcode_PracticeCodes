class Solution 
{
    public String mostCommonWord(String paragraph, String[] banned) 
    {        
        paragraph = paragraph.replaceAll("[^a-zA-Z0-9 ]", " ");
        paragraph = paragraph.toLowerCase();
        
        String parts[] = paragraph.split(" ");
        
        Set<String> bannedWords = new HashSet();
        for (String word : banned)
            bannedWords.add(word);
        
        HashMap<String, Integer> myMap = new HashMap<String, Integer>();
        
         for (String word : parts) {
            if (!bannedWords.contains(word))
                myMap.put(word, myMap.getOrDefault(word, 0) + 1);
        }
        
        
        String result = "";
        
        for(String key:myMap.keySet())
        {
            if(result.equals("") || myMap.get(key) > myMap.get(result))
            {
                result = key;
            }
        }
        
        return result;
        
        /*
        int count = 1;
        for(int i = 0; i < parts.length; i++)
        {
            if(myMap.containsKey(parts[i]))
            {
                 myMap.put(parts[i], count+1);
            }
            else if(!bannedWords.contains(parts[i]))
            {
                myMap.put(parts[i], count);
            }
        }
        */
        
        
        //Belowed return works, but its to complicated.
        //return Collections.max(myMap.entrySet(), Map.Entry.comparingByValue()).getKey();  
        
        //System.out.println(Arrays.asList(myMap));
        
        
        
        //System.out.println(paragraph);
        
        //return paragraph;
                
    }
}
