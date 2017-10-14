package vshare.common.manager.impl;

import vshare.common.entity.FileEntity;
import vshare.common.entity.FolderEntity;
import vshare.common.manager.Biz;
import vshare.common.manager.FileManager;

import java.util.List;

public class BizImpl implements Biz {
    FileManager fileManager;

    public void setFileManager(FileManager fileManager) {
        this.fileManager = fileManager;
    }

    @Override
    public boolean createFolder(long userId, String folderName, long folderParentId) {
        return fileManager.createFolder(userId, folderName, folderParentId);
    }

    @Override
    public boolean deleteFolder(long userId, long folderId) {
        return fileManager.deleteFolder(userId, folderId);
    }

    @Override
    public boolean renameFolder(long userId, long folderId, String newName) {
        return fileManager.renameFolder(userId, folderId, newName);
    }

    @Override
    public boolean createFile(long userId, String fileName, long fileId) {
        return fileManager.createFile(userId, fileName, fileId);
    }

    @Override
    public boolean deleteFile(long userId, long fileId) {
        return fileManager.deleteFile(userId, fileId);
    }

    @Override
    public boolean renameFile(long userId, long fileName, long fileId) {
        return renameFile(userId, fileName, fileId);
    }

    @Override
    public List<FileEntity> getAllFiles(long userId) {
        return fileManager.getAllFiles(userId);
    }

    @Override
    public List<FolderEntity> getAllFolders(long userId) {
        return fileManager.getAllFolders(userId);
    }

    @Override
    public List<FileEntity> getFiles(long userId, long folderId) {
        return fileManager.getFiles(userId, folderId);
    }

    @Override
    public List<FolderEntity> getFolders(long userId, long folderId) {
        return fileManager.getFolders(userId, folderId);
    }


}
