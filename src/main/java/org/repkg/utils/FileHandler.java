package org.repkg.utils;


public class FileHandler {
    public String inputPath;
    public String outputPath;

    public FileHandler() {
        this.inputPath = "resources/autoconfig.xml";
        this.outputPath = constructLogFilePath();
    }

    public FileHandler(String inputPath) {
        this.inputPath = inputPath;
        this.outputPath = constructLogFilePath();
    }

    public String getInputPath() {
        return inputPath;
    }

    public String getOutputPath() {
        return outputPath;
    }

    public void setInputPath(String inputPath) {
        this.inputPath = inputPath;
    }


    public String constructLogFilePath() {
        return "/temp/output/logs/repkg-" + Date.getCurrentDate() + ".txt";
    }

} 