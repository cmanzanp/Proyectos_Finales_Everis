package com.everis.taskmanager.services;

import java.util.List;
import com.everis.taskmanager.model.EverisProject;

public interface EverisProjectService {
	public EverisProject createProject(EverisProject project);

	public List<EverisProject> getProjects();

	public EverisProject getProjectById(Integer id);

	public List<EverisProject> deleteProjectById(Integer id);

	public EverisProject updateProjectById(EverisProject p, Integer id);

	public EverisProject addUserById(Integer idp, Integer idu);

	public EverisProject deleteUserFromProject(Integer idp, Integer idu);
}
