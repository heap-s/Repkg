package org.repkg.logger;

import org.repkg.exceptions.Exceptions;

public final class Logger implements Exceptions {
    private enum logLevel{
        WARNING,
        ERROR,
        FATAL
    }
    public void PackageNotFoundException() {
        System.err.println("Package not found");
    }
    public void PackageVersionNotFoundException() {
        System.err.println("Package version not found");
    }
    public void PackageVersionAlreadyExistsException() {
        System.err.println("Package version already exists");
    }
    public void PackageAlreadySatisfiedException() {
        System.err.println("Package already satisfied");
    }
    public void PackageNotSatisfiedException() {
        System.err.println("Package not satisfied");
    }
    public void PackageVersionNotSatisfiedException() {
        System.err.println("Package version not satisfied");
    }
    public void PackageVersionAlreadySatisfiedException() {
        System.err.println("Package version already satisfied");
    }
    public void PackageVersionNotExistsException() {
        System.err.println("Package version not exists");
    }
}
