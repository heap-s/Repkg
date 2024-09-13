package org.repkg.logger;

public class Logger{
    private enum logLevel{
        WARNING,
        ERROR,
        FATAL
    }
    public String PackageNotFoundException() {
        System.err.println(logLevel.ERROR + ": Package not found");
        return logLevel.ERROR + ": Package not found";
    }
    public String PackageVersionNotFoundException() {
        System.err.println(logLevel.WARNING + ": Package version not found");
        return logLevel.WARNING + ": Package version not found";

    }
    public String PackageAlreadySatisfiedException() {
        System.err.println(logLevel.WARNING + ": Package already satisfied");
        return logLevel.WARNING + ": Package already satisfied";

    }
    public String PackageNotSatisfiedException() {
        System.err.println(logLevel.FATAL + ": Package not satisfied");
        return logLevel.FATAL + ": Package not satisfied";

    }
    public String PackageVersionAlreadySatisfiedException() {
        System.err.println(logLevel.WARNING + ": Package version already satisfied");
        return logLevel.WARNING + ": Package version already satisfied";

    }
    public String PackageVersionNotExistsException() {
        System.err.println(logLevel.FATAL + ": Package version not exists");
        return logLevel.FATAL + ": Package version not exists";

    }

    public String CannotFetchPackageException(){
        System.err.println(logLevel.ERROR + ": Could not fetch package from remote");
        return logLevel.ERROR + ": Could not fetch package from remote"; 
    }
}
