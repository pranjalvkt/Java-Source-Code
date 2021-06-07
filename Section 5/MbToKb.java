public class MbToKb
{
    public static void main(String[] args) 
    {
        System.out.println(Middle(2500));
    }

    public static int Middle(int kiloBytes)
    {
        if(kiloBytes < 0)
        {
            System.out.println("Invalid Value");
        }
        else
        {
            int MB = kiloBytes / 1024;
            int remainingKiloBytes = kiloBytes % 1024;
        }
        return kiloBytes;
    }
    
    public static void printMegaBytesAndKiloBytes(int kiloBytes) // 1 mb =1024 kb
    {
        int MB;
        int remainingKiloBytes;

        if(kiloBytes < 0)
        {
            System.out.println("Invalid Value");
        }
        else
        {
            MB = kiloBytes / 1024;
            remainingKiloBytes = kiloBytes % 1024;
            System.out.println(kiloBytes + "KB = " + MB + " MB and " + remainingKiloBytes + "KB" );

        }
    }
}