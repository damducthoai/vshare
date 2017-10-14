package vshare.common.manager;

import vshare.common.entity.FileEntity;
import vshare.common.entity.FolderEntity;

import java.util.List;

public interface FileManager {
    /**
     * Create folder for user
     *
     * @param userId
     * @param folderName
     * @param folderParentId
     * @return success ? true : false
     */
    boolean createFolder(long userId, String folderName, long folderParentId);

    /**
     * Delete a folder from user account
     *
     * @param userId
     * @param folderId
     * @return success? true : false
     */
    boolean deleteFolder(long userId, long folderId);

    /**
     * Rename folder from user account
     *
     * @param userId
     * @param folderId
     * @param newName
     * @return
     */
    boolean renameFolder(long userId, long folderId, String newName);

    /**
     * Create new file for user
     *
     * @param userId
     * @param fileName
     * @param fileId
     * @return sucess ? true : false
     */
    boolean createFile(long userId, String fileName, long fileId);

    /**
     * Delete file from user
     *
     * @param userId
     * @param fileId
     * @return sucess ? true : false
     */
    boolean deleteFile(long userId, long fileId);

    /**
     * Rename file from user account
     *
     * @param userId
     * @param fileName
     * @param fileId
     * @return sucess ? true : false
     */
    boolean renameFile(long userId, long fileName, long fileId);

    /**
     * get all file from user account
     *
     * @param userId
     * @return List file
     */
    List<FileEntity> getAllFiles(long userId);

    /**
     * get all folder from user account
     *
     * @param userId
     * @return all folder from user
     */
    List<FolderEntity> getAllFolders(long userId);

    /**
     * get file from account folder
     *
     * @param userId
     * @param folderId
     * @return list file
     */
    List<FileEntity> getFiles(long userId, long folderId);

    /**
     * get folder from account folder
     *
     * @param userId
     * @param folderId
     * @return list folder
     */
    List<FolderEntity> getFolders(long userId, long folderId);

}
