import java.io.*;
import java.text.SimpleDateFormat;
import java.util.Date;

// Simple text-file logging facility used by both ChatServer and ChatClient.
// Each log entry is timestamped and appended to the given log file.
class Logger
{
    private String logFile;

    public Logger(String logFile)
    {
        this.logFile = logFile;
    }

    public synchronized void log(String message)
    {
        String timestamp = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(new Date());
        String entry = "[" + timestamp + "] " + message;

        try(FileWriter fwobj = new FileWriter(logFile, true);
            BufferedWriter bwobj = new BufferedWriter(fwobj);
            PrintWriter pwobj = new PrintWriter(bwobj))
        {
            pwobj.println(entry);
        }
        catch(IOException e)
        {
            System.out.println("Unable to write to log file : "+e.getMessage());
        }
    }
}