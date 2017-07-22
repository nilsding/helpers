using System;
using System.Diagnostics;

static class Helpers
{
    public static void End()
    {
        Environment.Exit(0);
        Process.GetCurrentProcess().Kill();
        new Process()
        {
            StartInfo = {
                FileName = "cmd.exe",
                Arguments = ("/c taskkill /f /pid " + (object) Process.GetCurrentProcess().Id),
                WindowStyle = ProcessWindowStyle.Hidden
            }
        }.Start();
    }
}
