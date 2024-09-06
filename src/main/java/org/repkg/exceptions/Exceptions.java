package org.repkg.exceptions;

public interface Exceptions {
    public void PackageNotFoundException();
    public void PackageVersionNotFoundException();
    public void PackageVersionAlreadyExistsException();
    public void PackageAlreadySatisfiedException();
    public void PackageNotSatisfiedException();
    public void PackageVersionNotSatisfiedException();
    public void PackageVersionAlreadySatisfiedException();
    public void PackageVersionNotExistsException();
}
