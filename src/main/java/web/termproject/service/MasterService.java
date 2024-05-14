package web.termproject.service;

import web.termproject.domain.dto.request.ClubRequestDTO;
import web.termproject.domain.dto.response.ClubResponseDTO;

import java.util.List;

public interface MasterService {
    List<ClubResponseDTO> getMasterClubsInfo(Long memberId);
    ClubResponseDTO findMasterClubInfo(Long clubId, Long memberId);
    ClubResponseDTO updateMasterClubInfo(Long clubId, Long memberId, ClubRequestDTO clubRequestDTO);
}
