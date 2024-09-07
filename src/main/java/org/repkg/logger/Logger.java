package org.repkg.logger;

import org.repkg.exceptions.Exceptions;

public final class Logger implements Exceptions {
    private enum logLevel{
        WARNING,
        ERROR,
        FATAL
    }
    public void PackageNotFoundException() {
        System.err.println(logLevel.ERROR + ": Package not found");
    }
    public void PackageVersionNotFoundException() {
        System.err.println(logLevel.WARNING + ": Package version not found");
    }
    public void PackageAlreadySatisfiedException() {
        System.err.println(logLevel.WARNING + ": Package already satisfied");
    }
    public void PackageNotSatisfiedException() {
        System.err.println(logLevel.FATAL + ": Package not satisfied");
    }
    public void PackageVersionAlreadySatisfiedException() {
        System.err.println(logLevel.WARNING + ": Package version already satisfied");
    }
    public void PackageVersionNotExistsException() {
        System.err.println(logLevel.FATAL + ": Package version not exists");
    }

    public void CannotFetchPackageException(){
        System.err.println(logLevel.ERROR + ": Could not fetch package from remote");
    }
}
