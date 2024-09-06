package org.repkg.packages;

public class PackageVer {
    private String version;
    private String packageName;
    private String sha256;

    public PackageVer() {
        this.version = "";
        this.packageName = "";
        this.sha256 = "";
    }

    public PackageVer(String version, String packageName, String sha256) {
        this.version = version;
        this.packageName = packageName;
        this.sha256 = sha256;
    }

    public String getVersion() {
        return version;
    }

    public String getPackageName() {
        return packageName;
    }

    public String getSha256() {
        return sha256;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    public void setPackageName(String packageName) {
        this.packageName = packageName;
    }

    public void setSha256(String sha256) {
        this.sha256 = sha256;
    }
    

}
