package vshare.common.manager;

public interface FileManager {
    /**
     * Create folder for user
     *
     * @param userId
     * @param name
     * @param parent
     * @return success ? true : false
     */
    boolean createFolder(long userId, String name, long parent);
}
