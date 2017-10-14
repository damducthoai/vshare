package vshare.common.manager.impl;

import vshare.common.manager.Biz;
import vshare.common.manager.FileManager;

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
}