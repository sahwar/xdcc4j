package it.luigibifulco.xdcc4j.downloader.service.servlet;

import it.luigibifulco.xdcc4j.downloader.core.service.DownloaderServiceModule;
import it.luigibifulco.xdcc4j.downloader.service.DownloaderServletModule;

import com.google.inject.AbstractModule;
import com.google.inject.Guice;
import com.google.inject.Injector;
import com.google.inject.servlet.GuiceServletContextListener;

public class XdccDownloadServletListener extends GuiceServletContextListener {

	public static class DownloaderModule extends AbstractModule {
		protected void configure() {
			install(new DownloaderServiceModule("./"));
			install(new DownloaderServletModule());
		};
	}

	@Override
	protected Injector getInjector() {
		return Guice.createInjector(new DownloaderModule());
	}

}