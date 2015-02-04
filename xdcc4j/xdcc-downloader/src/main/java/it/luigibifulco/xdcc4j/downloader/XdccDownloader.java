package it.luigibifulco.xdcc4j.downloader;

import it.luigibifulco.xdcc4j.common.model.XdccRequest;
import it.luigibifulco.xdcc4j.downloader.impl.Download;

import java.util.List;
import java.util.Map;

public interface XdccDownloader {

	public boolean setServer(String server);

	public Download getDownload(String id);

	public int cleanSearch();

	public Map<String, XdccRequest> search(String where, String what);

	public String startDownload(String id);

	public String startAnyAvailableFromList();

	public String cancelDownload(String id);

	public List<String> cancelAll();

	public Map<String, XdccRequest> cache();

}
