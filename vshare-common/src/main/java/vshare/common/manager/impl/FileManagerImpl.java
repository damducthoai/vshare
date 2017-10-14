package vshare.common.manager.impl;

import vshare.common.entity.FileEntity;
import vshare.common.entity.FolderEntity;
import vshare.common.manager.FileManager;

import java.util.List;

public class FileManagerImpl implements FileManager {
    @Override
    public boolean createFolder(long userId, String folderName, long folderParentId) {
        // TODO
        return false;
    }

    @Override
    public boolean deleteFolder(long userId, long folderId) {
        // TODO
        return false;
    }

    @Override
    public boolean renameFolder(long userId, long folderId, String newName) {
        // TODO
        return false;
    }

    @Override
    public boolean createFile(long userId, String fileName, long fileId) {
        // TODO
        return false;
    }

    @Override
    public boolean deleteFile(long userId, long fileId) {
        // TODO
        return false;
    }

    @Override
    public boolean renameFile(long userId, long fileName, long fileId) {
        // TODO
        return false;
    }

    @Override
    public List<FileEntity> getAllFiles(long userId) {
        // TODO
        return null;
    }

    @Override
    public List<FolderEntity> getAllFolders(long userId) {
        // TODO
        return null;
    }

    @Override
    public List<FileEntity> getFiles(long userId, long folderId) {
        // TODO
        return null;
    }

    @Override
    public List<FolderEntity> getFolders(long userId, long folderId) {
        // TODO
        return null;
    }
}
