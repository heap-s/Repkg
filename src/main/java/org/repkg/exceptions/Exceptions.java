package org.repkg.exceptions;

public interface Exceptions {
    public String PackageNotFoundException();
    public String PackageVersionNotFoundException();
    public String PackageAlreadySatisfiedException();
    public String PackageNotSatisfiedException();
    public String PackageVersionAlreadySatisfiedException();
    public String PackageVersionNotExistsException();

    public String CannotFetchPackageException();
}
