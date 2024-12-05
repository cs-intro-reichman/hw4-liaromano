public class KeywordsDetector {
    public static void main(String[] args) {
        String[] sentences = {
            "Our product will transform the market",
            "Programming is both painful and engaging",
            "This has nothing to do with machine learning",
            "We need to leverage our core competencies",
            "Let's talk about data and algorithms",
            "Chatbots are great but must be used carefully",
            "This blockchain-based solution will disrupt the industry",
            "The team showed great Synergy in the last project",
            "Use simple words without hype and fluff",
            "Our new technology presents a significant paradigm shift",
            "Effective presentations must be clear, concise, and humble"
        };
        // Some keywords that typically signal bullshit contents in business presentations 
        String[] keywords = {"synergy", "disrupt", "leverage", "Paradigm", "transform"};
        detectAndPrint(sentences, keywords);
    }

    // Iterates through all the sentences.
    // If a sentence contains one or more of the kewords, prints it.
    public static void detectAndPrint(String[] sentences, String[] keywords) {
       String word="";
       String keyw="";
        for(int i=0;i<sentences.length;i++)
        {
            for(int j=0;j<keywords.length;j++)
            {
                
                word=sentences[i];
                keyw=keywords[j];
                if(contains(word.toLowerCase(), keyw.toLowerCase()))
                {
                    System.out.println(sentences[i]);
                }
            }
        }

    }
    public static boolean contains(String str1, String str2) {
       boolean isContains=false;
       int lastIndex= str1.length()-str2.length()+1;;
       if(str2.length()==0)
       {
        return true;
       }
       if(str1.length()<str2.length())
       {
        return false;
       }
       else
       {
        for(int i=0;i<lastIndex&& !isContains;i++)
        {
            if(str1.charAt(i)==str2.charAt(0))
            {
                isContains=true;
                for(int j=0;j<str2.length()&& isContains;j++)
                {
                    isContains=(str2.charAt(j)==str1.charAt(i+j));
                }
            }

        }
       }
       return isContains;
    }
}

