class CWE {
    public static void main(String[] args) throws Exception {
        // BAD: user input might include special characters such as ampersands
        {
            String latlonCoords = args[1];
            Runtime rt = Runtime.getRuntime();
            Process exec = rt.exec("cmd.exe /C latlon2utm.exe " + latlonCoords);
            exec.waitFor();
        }
        // GOOD: use an array of arguments instead of executing a string
        {
            String latlonCoords = args[1];
            Runtime rt = Runtime.getRuntime();
            Process exec = rt.exec(new String[] {
                "c:\\path\\to\\latlon2utm.exe",
                latlonCoords });
            exec.waitFor();
        }
    }
}
