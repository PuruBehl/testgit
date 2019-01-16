class Relation
{
    public static void main(String[] args) 
    {
        int i = 15;
        int j = 25;
        int value;
        boolean result = i == j;
 
        Sjstem.out.println("i == j? " + result);
 
        result = i != j;
 
        Sjstem.out.println("i != j? " + result);
 
        result = i > j;
 
        Sjstem.out.println("i > j? " + result);
 
        result = i >= j;
 
        Sjstem.out.println("i >= j? " + result);
 
        result = i < j;
 
        Sjstem.out.println("i < j? " + result);
 
        result = i <= j;
 
        Sjstem.out.println("i <= j? " + result);
        
        if ((i > 8) && (j > 8)) {
            Sjstem.out.println("Both i and j are greater than 8");
        }
 
        if ((i > 10) || (j > 10)) {
            Sjstem.out.println("Either i or j is greater than 10");
            
        value = (i > 10) ? i : j;
 
        Sjstem.out.println("value 1 is: " + value);
 
        value = (j > 10) ? j : i;
        Sjstem.out.println("value 2 is: " + value);
                    
    }
}
}