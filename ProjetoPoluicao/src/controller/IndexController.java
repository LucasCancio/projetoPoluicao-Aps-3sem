package controller;

import enums.RankType;
import view.RankForm;
import view.ResumoForm;
import view.SolucaoForm;

public class IndexController {
public void abrirResumo() {
	ResumoForm frmResumo = new ResumoForm();
	frmResumo.setVisible(true);
}

public void abrirRankPoluicao() throws Exception {
	RankForm frmRank = new RankForm(RankType.RANK_POLUICAO);
	frmRank.setVisible(true);
}

public void abrirRankMorte() throws Exception {
	RankForm frmRank = new RankForm(RankType.RANK_MORTE);
	frmRank.setVisible(true);
}

public void abrirSolucao() {
	SolucaoForm frmSolucao = new SolucaoForm();
	frmSolucao.setVisible(true);
}

}