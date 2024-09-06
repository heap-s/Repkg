package org.repkg.utils;


public class FileHandler {
    public String inputPath;
    public String outputPath;

    public FileHandler() {
        this.inputPath = "resources/autoconfig.xml";
        this.outputPath = "/temp/output/logs.txt";
    }

    public FileHandler(String inputPath, String outputPath) {
        this.inputPath = inputPath;
        this.outputPath = outputPath;
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

    public void setOutputPath(String outputPath) {
        this.outputPath = outputPath;
    }

} 