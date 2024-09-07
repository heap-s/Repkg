package org.repkg.exceptions;

public interface Exceptions {
    public void PackageNotFoundException();
    public void PackageVersionNotFoundException();
    public void PackageAlreadySatisfiedException();
    public void PackageNotSatisfiedException();
    public void PackageVersionAlreadySatisfiedException();
    public void PackageVersionNotExistsException();

    public void CannotFetchPackageException();
}
