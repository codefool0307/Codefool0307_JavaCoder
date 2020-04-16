clear;
close all;
f = 5;			    %frequency  (MHz)			
a = 6.35;		    % transducer radius (mm)
Fl = 76;		    % transducer focal length (mm) 
z1 = 0;		                 % path length in medium 1 (mm)
z2t = linspace(0,200,1000);        
rt=linspace(-20,20,1000);	
[z2, r]=meshgrid(z2t, rt);
% z2 = 65;  
% r=linspace(-20,20,1000);	
R0 = inf;			% interface radius of curvature (mm) 
d1 = 1.0;			% density, medium 1 (gm/cm^3)
d2 =1.0;		    % density, medium 2 (gm/cm^3)
c1 = 1480.;		    % wave speed, medium 1 (m/sec)
c2 = 1480.;		    % wave speed, medium 2 (m/sec)
% get Wen and Breazeale coefficients (10)
[A, B] = gauss_c15;	 
% transmission coefficient (base on pressure ratio)
T = (2*c2*d2)/(c1*d1+c2*d2);        
h = 1/R0;                                                      % interface curvature
zr = eps*(f == 0) + 1000*pi*(a^2)*f./c1;      % "Rayleigh" distance, ka^2/2 
k1 = 2*pi*1000*f./c1;		               % wave number in medium 1
%initialize  pressure to zero
p = 0;
%multi-Gaussian beam model
for  j = 1:15      % form up multi-Gaussian beam model with  % 10 Wen and Breazeale coefficients
 b =B(j) + i*zr./Fl;		% modify coefficients for focused probe								
q = z1 - i*zr./b;
K = q.*(1 -(c1/c2));
M = (1 +K.*h);
ZR = q./M;
m = 1./(ZR +(c2/c1).*z2);
   t1 = A(j)./(1 + (i.*b./zr).*z1);
   t2 = t1.*T.*ZR.*m;
   p = p + t2.*exp(i.*(k1./2).*m.*(r.^2));
end
% figure(1)
% pcolor(z2t, rt, abs(p));
% shading interp
% colorbar
% colormap(jet)
% % % set(gca,'XLim',[0 200]);%X÷·µƒ ˝æ›œ‘ æ∑∂Œß
% % % mesh(abs(p))
% ylabel('æ∂œÚæ‡¿Î£®mm£©')
% xlabel('÷·œÚæ‡¿Î£®mm£©')
figure(2)
mesh(abs(p));
colormap(jet)
% set(gca,'XLim',[0 200]);%X÷·µƒ ˝æ›œ‘ æ∑∂Œß
set(gca,'XTickLabel',{'0','100','200'})
set(gca,'YTickLabel',{'-20','0','20'})

% set(gca,'YTickLabel',{'-20','-15','-10','-5','0','5','10','15','20'})
ylabel('æ∂œÚæ‡¿Î£®mm£©')
xlabel('÷·œÚæ‡¿Î£®mm£©')
zlabel('…˘—π’Ò∑˘')
